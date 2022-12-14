package ra.dev;

import java.util.Scanner;

public class Product  {
    private String productId;
    private String productName;
    private String title;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private String descriptions;
    private boolean productStatus;
    private Catalog catalogs;

    public Product() {
    }

    public Product(String productId, String productName, String title, float importPrice, float exportPrice, int quantity, String descriptions, boolean productStatus, Catalog catalogs) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.productStatus = productStatus;
        this.catalogs = catalogs;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescription(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductSatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    public Catalog getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(Catalog catalogs) {
        this.catalogs = catalogs;
    }Scanner scanner=new Scanner(System.in);
    Catalog[] catalog1=new Catalog[1000];
    int indexMax;
    public void inputData1() {
        System.out.println("Nh???p th??ng tin s???n ph???m:");
        System.out.println("M?? s???n ph???m: ");
        this.productId = scanner.nextLine();
        System.out.println("T??n s???n ph???m: ");
        this.productName = scanner.nextLine();
        System.out.println("Ti??u ????? s???n ph???m");
        this.title = scanner.nextLine();
        System.out.println("Gi?? nh???p c???a s???n ph???m: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("S??? l?????ng c??n l???i c???a s???n ph???m: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("M?? t??? s???n ph???m: ");
        this.descriptions = scanner.nextLine();
        System.out.println("Tr???ng th??i c???a s???n ph???m: ");
        this.productStatus = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Chon danh muc san pham cua san pham: ");
        for (int i = 0; i < indexMax; i++) {
            System.out.printf("%d.%s\n", (i + 1), catalog1[i].getCatalogName());
        }
        System.out.print("Lua chon cua ban: ");
        int indexChoice = Integer.parseInt(scanner.nextLine());
        this.catalogs = catalog1[indexChoice - 1];
    }

    public void calExportPrice1() {
        this.exportPrice=this.importPrice * 1.2F;
    }
    public void displayData1() {
        System.out.printf("Ma SP: %s - Ten SP: %s - Tieu de: %s\n", this.productId, this.productName, this.title);
        System.out.printf("Gia nhap: %f - gia xuat: %f - So luong: %d\n", this.importPrice, this.exportPrice, this.quantity);
        String trangThai = "";
        if (this.productStatus) {
            trangThai = "Con ban";
        } else {
            trangThai = "Khong ban";
        }
        System.out.printf("M?? t??? s???n ph???m : %s  Trang thai: %s - Danh muc: %s\n",this.descriptions,trangThai,this.catalogs);

    }

}
