package OopJava.DanhSachTrungTuyen;

public class TrungTuyen implements Comparable<TrungTuyen>{
   private String id, name;
    private double toan, ly, hoa;

    public TrungTuyen(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = getTen(name);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public String getTen(String ten){
        String[] s = ten.toLowerCase().trim().split("\\s+");
        String res = "";
        for(int i = 0; i < s.length; i++){
            res += s[i].substring(0, 1).toUpperCase() + s[i].substring(1) + " ";
        }
        return res.trim();
    }
    
    public double kv(){
        String tmp = id.substring(0, 3);
        if(tmp.equals("KV1")){
            return 0.5;
        }else if(tmp.equals("KV2")){
            return 1.0;
        }else{
            return 2.5;
        }
    }
    public double sumAll(){
        return toan * 2 + ly + hoa + kv();
    }
    public String trangThai(double tong, double diem){
        if(tong < diem){
            return "TRUOT";
        }else{
            return "TRUNG TUYEN";
        }
    }
    public void show(double diem){
        double tong = sumAll();
        double khuVuc = kv();
        if((tong - (int)tong == 0) && (khuVuc - (int)khuVuc == 0)){
            System.out.println(id + " " + name + " " + (int)khuVuc +
                    " " + (int)tong + " " + trangThai(tong, diem));
        }else if((tong - (int)tong != 0) && (khuVuc - (int)khuVuc == 0)){
            System.out.println(id + " " + name + " " + (int)khuVuc +
                    " " + tong + " " + trangThai(tong, diem));
        }else if((tong - (int)tong == 0) && (khuVuc - (int)khuVuc != 0)){
            System.out.println(id + " " + name + " " + khuVuc +
                    " " + (int)tong + " " + trangThai(tong, diem));
        }else{
            System.out.println(id + " " + name + " " + khuVuc +
                    " " + tong + " " + trangThai(tong, diem));
        }
    }

    @Override
    public int compareTo(TrungTuyen o) {
        if(this.sumAll() > o.sumAll()) return -1;
        if(this.sumAll() < o.sumAll()) return 1;
        return this.id.compareTo(o.id);
    }
}
