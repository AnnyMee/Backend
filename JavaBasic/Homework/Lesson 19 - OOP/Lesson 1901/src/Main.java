/*
Придумайте и опишите класс, для любой предметной области.
Например, товар в интернет-магазине или автомобиль для продажи или любой другой.
В вашем классе должно быть несколько полей. Сделайте конструктор.
Сделайте toString. В main создайте несколько объектов своего класса,
положите их в массив и, по образу и подобию классной работы выведите на экран.
 */
public class Main {
    public static void main(String[] args) {
        //region DatesOfRelease
        Date dateOfRelease1 = new Date(5,12,2020);
        Date dateOfRelease2 = new Date(17,12,2020);
        Date dateOfRelease3 = new Date(8,1,2021);
        Date dateOfRelease4 = new Date(6,7,2021);
        Date dateOfRelease5 = new Date(26,7,2021);
        Date dateOfRelease6 = new Date(18,9,2021);
        Date dateOfRelease7 = new Date(5,2,2022);
        Date dateOfRelease8 = new Date(7,4,2022);
        Date dateOfRelease9 = new Date(15,8,2022);
        Date dateOfRelease10 = new Date(28,2,2023);
        //endregion
        //region DetailsOfComputers
        PCData details1 = new PCData("Intel Core i3","Windows 10","GeForce RTX 3060 Ti",8,500,15,3,4000,true,false,false,false,false);
        PCData details2 = new PCData("Intel Core i3", "Windows 10", "GeForce RTX 3060 Ti",8,500,16,3,4000,true,false,false,false,false);
        PCData details3 = new PCData("Intel Core i5","Windows 10", "GeForce RTX 3060 Ti",8,500,16,2,4200,false,false,false,false,false);
        PCData details4 = new PCData("Intel Core i5","Windows 10", "GeForce RTX 3060",12,1000,17,4,4400,true,true,false,false,false);
        PCData details5 = new PCData("AMD Ryzen 3","Windows 10", "GeForce RTX 3060 Ti",8,500,15.6,2,4200,false,false,false,false,false);
        PCData details6 = new PCData("AMD Ryzen 3","Windows 10", "GeForce RTX 3060 Ti",8, 525,16,3,4400,true,false,true,true,false);
        PCData details7 = new PCData("AMD Ryzen 5","Windows 11", "Radeon RX Vega 11",16,1000,15.6,3,4400,true,false,true,true,false);
        PCData details8 = new PCData("Intel Core i7","Windows 11", "GeForce RTX 4060",16, 1000,16,3,4600,false,false,false,false,true);
        PCData details9 = new PCData("Intel Core i7","Windows 11", "GeForce RTX 4060",32, 2000,17,4,4800,true,true,true,false,true);
        PCData details10 = new PCData("AMD Ryzen 7","Windows 11", "Radeon RX 7600",32, 2000,16,4,4800,true,true,true,false,true);
        //endregion
        //region CompleteData
        MyComputer mainData1 = new MyComputer("Dell","Inspirion","Grey","ABS",dateOfRelease1,details1, 449.99,false);
        MyComputer mainData2 = new MyComputer("Lenovo","IdeaPad","Grey","Metal",dateOfRelease2,details2,529.99,false);
        MyComputer mainData3 = new MyComputer("ASUS","TUF","Black","ABS",dateOfRelease3,details3,819.49,true);
        MyComputer mainData4 = new MyComputer("ASUS","TUF","Silver","ABS",dateOfRelease4,details4,929.99,false);
        MyComputer mainData5 = new MyComputer("HP","Pavilion","Metal Silver","Metal",dateOfRelease5,details5,654.49,true);
        MyComputer mainData6 = new MyComputer("Lenovo","ThinkPad","Carbon Black","Polycarbonate",dateOfRelease6,details6,764.99,true);
        MyComputer mainData7 = new MyComputer("HP","Victus","Midnight Black","Polycarbonate",dateOfRelease7,details7,1029.99,false);
        MyComputer mainData8 = new MyComputer("HP","Victus","Gold Limited","ABS",dateOfRelease8,details8,1449.99,true);
        MyComputer mainData9 = new MyComputer("ASUS","ROG","Shiny Black","Metal",dateOfRelease9,details9,1844.49,false);
        MyComputer mainData10 = new MyComputer("Lenovo","Legion","Black","Polycarbonate",dateOfRelease10,details10,1649.49,true);
        //endregion
        //region PCArrays
        MyComputer[] dell = {mainData1};
        MyComputer[] lenovo = {mainData2, mainData6,mainData10};
        MyComputer[] asus = {mainData3, mainData4, mainData9};
        MyComputer[] hp = {mainData5, mainData7, mainData8};
        //endregion

        for(MyComputer info : dell){
            System.out.println(info);
        }
        for(MyComputer info : lenovo){
            System.out.println(info);
        }
        for (MyComputer info : asus){
            System.out.println(info);
        }
        for(MyComputer info : hp){
            System.out.println(info);
        }
    }
}