package ra.dev;

import java.util.Scanner;

public class ProductManagement {


    static Product[] listProduct = new Product[1000];
    static Catalog[] listCatalog = new Catalog[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----------MENU-------------");
            System.out.println("1.Quan ly danh mục");
            System.out.println("2.Quan ly san pham");
            System.out.println("3.Thoat");
            System.out.println("Vui long nhap su lua chon cua ban: ");
            int chon = sc.nextInt();
          switch (chon){
              case 1:
                   int index = 0;
                boolean exit = true;
                do {
                    System.out.println("--------MENU----------");
                    System.out.println("1.Nhap thong tin cho n danh muc san pham:");
                    System.out.println("2.Hien thi thong tin theo do uu tien");
                    System.out.println("3.Cap nhat thong tin danh muc theo ma danh muc");
                    System.out.println("4.Thoat");
                    System.out.println("Vui long nhap su lua chon cua ban");
                    int nhap = sc.nextInt();
                    switch (nhap) {
                        case 1:
                            System.out.println("Ban muon nhap bao nhieu danh muc: ");
                            int n = sc.nextInt();
                            for (int i = index; i < n; i++) {
                                System.out.printf("San pham thu %d la: \n", index + 1);
                                listCatalog[index] = new Catalog();
                                listCatalog[index].inputData2();
                                index++;
                            }
                            break;
                        case 2:
                            for (int i = 0; i < index - 1; i++) {
                                for (int j = i + 1; j < index; j++) {
                                    if (listCatalog[j].getPriority() < listCatalog[i].getPriority()) {
                                        Catalog doUuTien = listCatalog[i];
                                        listCatalog[i] = listCatalog[j];
                                        listCatalog[j] = doUuTien;
                                    }
                                }
                            }
                            for (int i = 0; i < index; i++) {
                                listCatalog[i].displayData2();
                                System.out.print("\n");
                            }

                            System.out.println("Đã sắp xếp xong theo do uu tien");
                            break;
                        case 3:
                            int update = 0;
                            System.out.println("Nhập vào danh muc cần cần nhật thông tin theo ma danh muc:");
                            sc.nextLine();
                            update = Integer.parseInt(sc.nextLine());
                            int indexUpdate = -1;
                            for (int i = 0; i < index; i++) {
                                if (listCatalog[i].getCatalogId() == update) {
                                    indexUpdate = 1;
                                    break;
                                }
                            }
                            if (indexUpdate != -1) {
                                System.out.println("Nhập tên danh mục cần cập nhật:");
                                String catalogName = sc.nextLine();
                                if (catalogName != "" && catalogName.length() != 0) {
                                    listCatalog[indexUpdate].setCatalogName(catalogName);
                                }
                                System.out.println("Nhap vao do uu tien");
                                String priority = sc.nextLine();
                                if (priority != "" && priority.length() != 0) {
                                    listCatalog[indexUpdate].setPriority(Integer.parseInt(priority));
                                }
                                System.out.println("Nhap vao trang thai cua danh muc");
                                String catalogStatus = sc.nextLine();
                                if (catalogStatus != "" && catalogStatus.length() != 0) {
                                    listCatalog[indexUpdate].setCatalogStatus(Boolean.parseBoolean(catalogStatus));
                                }
                            }
                            System.out.println("Đã cập nhật trạng thái sp thành công");
                            break;
                        case 4:
                            exit = false;
                            break;
                        default:
                            System.err.println("Vui long nhap tu 1-4");
                    }

                } while (exit);
                break;
              case 2:
                   int index1 = 0;
                boolean thoat = true;
                do {
                    System.out.println("--------MENU---------");
                    System.out.println("1. Nhập thông tin cho n sản phẩm (n nhập từ bàn phím)");
                    System.out.println("2. Tính giá bán cho tất cả sản phẩm");
                    System.out.println("3. Hiển thị thông tin các sản phẩm");
                    System.out.println("4. Sắp xếp sản phẩm theo giá bán tăng dần");
                    System.out.println("5. Tìm kiếm sản phẩm theo tên sản phẩm");
                    System.out.println("6. Thống kê số lượng và in thông tin các sản phẩm sắp hết hàng");
                    System.out.println("7. Cập nhật trạng thái của sản phẩm theo mã sản phẩm");
                    System.out.println("8.Bán sản phẩm");
                    System.out.println("9.Nhập sản phẩm");
                    System.out.println("10.Thoát");
                    System.out.println("Vui lòng nhập sự lựa chọn của bạn:");
                    int a = sc.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println("So san pham muon nhap: ");
                            int number = sc.nextInt();

                            for (int i = index1; i < number; i++) {
                                System.out.printf("San pham thu %d la: \n", index1 + 1);
                                listProduct[index1] = new Product();
                                listProduct[index1].inputData1();
                                index1++;
                            }
                            break;
                        case 2:
                            for (int i = 0; i < index1; i++) {
                                listProduct[i].calExportPrice1();
                            }
                            System.out.println("Da tinh gia ban tat ca cac san pham");
                            break;
                        case 3:
                            for (int i = 0; i < index1; i++) {
                                listProduct[i].displayData1();
                                System.out.println("\n");
                            }
                            break;
                        case 4:
                            Product gia = listProduct[0];
                            for (int i = 0; i < index1 - 1; i++) {
                                for (int j = i + 1; j < index1; j++) {
                                    if (listProduct[j].getExportPrice() < listProduct[i].getExportPrice()) {
                                        gia = listProduct[i];
                                        listProduct[i] = listProduct[j];
                                        listProduct[j] = gia;
                                    }
                                }
                            }
                            System.out.println("Đã sắp xếp xong theo giá tăng dần");
                            break;
                        case 5:
                            String seach = "";
                            System.out.println("Nhập tên sp muốn tìm kiếm");
                            sc.nextLine();
                            seach = sc.nextLine();
                            for (int i = 0; i < index1; i++) {
                                if (listProduct[i].getProductName().startsWith(seach)) {
                                    listProduct[i].displayData1();
                                }
                            }
                            break;
                        case 6:

                            int cnt = 0;
                            System.out.println("Thống kê các sản phẩm sắp hết hàng");
                            for (int i = 0; i < index1; i++) {
                                if (listProduct[i].getQuantity() <= 5) {
                                    cnt++;
                                    listProduct[i].displayData1();
                                }
                            }
                            break;
                        case 7:
                            String update = "";
                            System.out.println("Nhập vào sp cần cần nhật trạng thái");
                            sc.nextLine();
                            update = sc.nextLine();
                            for (int i = 0; i < index1; i++) {
                                if (listProduct[i].getProductId().equals(update)) {
                                    listProduct[i].setProductSatus(!listProduct[i].isProductStatus());
                                }
                            }
                            System.out.println("Đã cập nhật trạng thái sp thành công");
                            break;
                        case 8:
                            String spBan = "";
                            System.out.println("Bạn muốn bán sản phẩm nào");
                            sc.nextLine();
                            spBan = sc.nextLine();
                            System.out.println("Bán bao nhiêu:");
                            int ban = Integer.parseInt(sc.nextLine());
                            for (int i = 0; i < index1; i++) {
                                if ( listProduct[i].getProductName().equals(spBan)) {
                                    int c = listProduct[i].getQuantity();
                                    listProduct[i].setQuantity(c-=ban);
                                    System.out.println("Da ban xong san pham");
                                }else {
                                    System.out.println("Sản phẩm không có trong dữ liệu");
                                }

                            }


                            break;
                        case 9:
                            System.out.println("sản phẩm bạn muốn nhập:");
                            String m=sc.nextLine();
                            sc.nextLine();
                            System.out.println("Bạn muốn nhập số lượng bao nhiêu:");
                            int nhapHang=Integer.parseInt(sc.nextLine());
                            for (int i = 0; i < index1; i++) {
                                if (listProduct[i].getProductName().equals(m)){
                                    int d=listProduct[i].getQuantity();
                                    listProduct[i].setQuantity(d +=nhapHang);
                                    System.out.println("đã nhập thành công");
                                }else {
                                    listProduct[i].inputData1();
                                    listProduct[i].setQuantity(nhapHang);
                                }
                            }
                            for (int i = 0; i < index1; i++) {
                                listProduct[i].displayData1();
                            }
                            break;
                        case 10:
                            thoat = false;
                            break;
                        default:
                            System.err.println("Vui lòng nhập từ 1-8");
                    }
                } while (thoat);
                break;
              case 3:
                System.exit(0);
              default:
                System.out.println("Vui lòng nhập từ 1-3");
            }
        } while (true);

    }

}

