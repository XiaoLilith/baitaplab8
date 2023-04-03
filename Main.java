class Main {
    public static void main(String[] args) {
        xeDap XD = new xeDap();
        MayBay MB = new MayBay();
        System.out.println(MB.loaiPhuongTien());
        MB.catCanh();
        MB.haCanh();
        System.out.println("Van Toc:"+MB.layVanToc());
        xeOto OT = new xeOto();
        System.out.println(OT.loaiPhuongTien());
        System.out.println("Van Toc:"+OT.layVanToc());
        System.out.println(XD.loaiPhuongTien());
        System.out.println("Van Toc:"+XD.layVanToc());
    }
}