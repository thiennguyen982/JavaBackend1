package JavaCore;

public class Lec07Exam {
    
    static class SinhVien {
        //Thuộc tính
        String tenSV="Default";
        String maSV="Default";
        String dcLienLac="Default";
        int tuoi;

        //Khởi tạo

        SinhVien(){
        }

        SinhVien(String tenSV, String maSV, String dcLienLac, int tuoi){
            this.tenSV = tenSV;
            this.maSV = maSV;
            this.dcLienLac = dcLienLac;
            this.tuoi = tuoi;
        }

        SinhVien(String maSV, String dcLienLac, int tuoi, String tenSV){
            this.maSV = maSV;
            this.dcLienLac = dcLienLac;
            this.tuoi = tuoi;
            this.tenSV = "Default";
        }

        void xemThongTin(){
            System.out.printf("Ma sinh vien: %s\n", this.maSV);
            System.out.printf("Ten sinh vien: %s\n", this.tenSV);
            System.out.printf("Dia chi lien lac: %s\n", this.dcLienLac);
            System.out.printf("Tuoi: %d\n", this.tuoi);
        }
    }

    public static void main(String[] args){
        SinhVien sv1 = new Lec07Exam.SinhVien();
        SinhVien sv2 = new Lec07Exam.SinhVien("Nguyễn Hoàng Thiện", "2270758", "79/16 Nguyễn Thượng Hiền, quận Bình Thạnh, TPHCM", 24);

        sv1.xemThongTin();
        sv2.xemThongTin();
    }
}
