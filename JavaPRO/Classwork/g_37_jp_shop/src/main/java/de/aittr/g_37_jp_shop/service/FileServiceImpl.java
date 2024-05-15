package de.aittr.g_37_jp_shop.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import de.aittr.g_37_jp_shop.service.interfaces.FileService;
import de.aittr.g_37_jp_shop.service.interfaces.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    private AmazonS3 client;
    private ProductService productService;

    public FileServiceImpl(AmazonS3 client, ProductService productService) {
        this.client = client;
        this.productService = productService;
    }

    @Override
    public String upload(MultipartFile file, String productTitle) {
        try {
            String uniqueFileName = generateUniqueFileName(file);

            Files.copy(file.getInputStream(), Path.of("C:\\Users\\annyp\\Desktop\\AIT_TR\\Backend\\JavaPRO\\Classwork\\g_37_jp_shop\\files\\" + uniqueFileName));

            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentType(file.getContentType());

            PutObjectRequest request = new PutObjectRequest("cohort-37-bucket", uniqueFileName, file.getInputStream(), metadata)
                    .withCannedAcl(CannedAccessControlList.PublicRead);
            client.putObject(request);

            String url = client.getUrl("cohort-37-bucket", uniqueFileName).toString();

            productService.attachImage(url, productTitle);
            return uniqueFileName;

        }catch (Exception e) {
            throw new RuntimeException();
        }
    }

    private String generateUniqueFileName (MultipartFile file) {

        String sourceFileName = file.getOriginalFilename();
        if (sourceFileName == null) {
            throw new RuntimeException("Original file name is empty");
        }
        int dotIndex = sourceFileName.lastIndexOf(".");
        String fileName = sourceFileName.substring(0, dotIndex);
        String extension = sourceFileName.substring(dotIndex);

        return String.format("%s-%s%s", fileName, UUID.randomUUID(), extension);
    }
}
