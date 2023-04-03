interface HangSanXuat{
String tenhangsanxuat();
String tenquocgia();

}
abstract   class Phuongtiendichuyen implements  HangSanXuat{
    String loaiphuongtien(){
    return loaiphuongtien();
    }
    void batdau(){
        System.out.println("Chuyen se bat dau sau");
    }
    void tangtoc(){
        System.out.println("chuyen se bat dau tag tgoc");
    }
    void dunglai(){
        System.out.println("chuyen se dung lai ");
    }
    abstract  double layvantoc();

    @Override
    public String tenhangsanxuat() {
        String tenhangsanxuat;
        tenhangsanxuat=" ten hang san xuat";
        return tenhangsanxuat
    }
}
class Maybay extends Phuongtiendichuyen{
    @Override
    String loaiphuongtien() {

    }
}