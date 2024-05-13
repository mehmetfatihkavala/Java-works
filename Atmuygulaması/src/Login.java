import java.util.Scanner;

public class Login {
    private String kullaniciAdi;
    private int sifre;
    private String telefonNo;
    private String email;
    
    public Login(String kullaniciAdi,int sifre,String telefonNo,String email){
        this.kullaniciAdi=kullaniciAdi;
        this.sifre=sifre;
        this.telefonNo=telefonNo;
        this.email=email;
    }
    
    public boolean giris(){
        boolean dogrulama;
        Scanner scanner = new Scanner(System.in);
        System.out.println("KULLANICI ADINIZI GİRİNİZ: ");
        String nick = scanner.nextLine();
        System.out.println("ŞİFRENİZİ GİRİNİZ: ");
        int parola = scanner.nextInt();
        if(kullaniciAdi.equals(nick) && sifre == parola){
            dogrulama =true;
            System.out.println("HOŞGELDİNİZ...");
            System.out.println("***************************");
        }else{
            dogrulama=false;
            System.out.println("KULLANICI ADI VEYA ŞİFRE YANLIŞ..."); 
            System.out.println("ÇIKIŞ YAPILIYOR...");
        }    
        return dogrulama;
    }
    
    
    
    

    /**
     * @return the kullaniciAdi
     */
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    /**
     * @param kullaniciAdi the kullaniciAdi to set
     */
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    /**
     * @return the sifre
     */
    public int getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
