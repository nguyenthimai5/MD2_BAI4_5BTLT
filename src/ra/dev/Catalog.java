package ra.dev;

import java.util.Scanner;

public class Catalog {
    private int catalogId;
    private String catalogName;
    private int priority;
    private boolean catalogStatus;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, int priority, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.catalogStatus = catalogStatus;
    }


    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
   Scanner sc=new Scanner(System.in);
    public void inputData2(){
        System.out.println("Moi nhap thong tin san pham: ");
        System.out.println("Ma danh muc san pham : ");
        this.catalogId=Integer.parseInt(sc.nextLine());
        System.out.println("Ten danh muc san pham :");
        this.catalogName=sc.nextLine();
        System.out.println("Do uu tien: ");
        this.priority=Integer.parseInt(sc.nextLine());
        System.out.println("Trang thai danh muc:");
        this.catalogStatus=Boolean.parseBoolean(sc.nextLine());
    }
    public  void  displayData2() {
        System.out.printf("Ma DM: %d - Ten DM: %s - Do UT: %d - Trang thai: %b\n",this.catalogId,this.catalogName,this.priority,this.catalogStatus);

    }

}
