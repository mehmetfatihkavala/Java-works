public class Account {
private String hesapNo;
private String isim;
private String email;
private String telefonNo;
private double bakiye;



public Account(){
    System.out.println("Yapıcı fonksiyon tetiklendi...");
}
public Account(String hesapNo,String isim,String email,String telefonNo,double bakiye){
    this.hesapNo=hesapNo;
    this.isim=isim;
    this.email=email;
    this.telefonNo=telefonNo;
    this.bakiye=bakiye;
           
}
    public void bilgileriGoster(){
        System.out.println("Hesap numarası: " + hesapNo);
        System.out.println("İsim: " + isim);
        System.out.println("E-mail: " + email);
        System.out.println("Telefon No: " + telefonNo);
        System.out.println("Bakiyeniz: " + bakiye);
    }
    public void paraCekme(double miktar){
        if(miktar>1500){
            System.out.println("Bir günde en fazla 1500 tl çekebilirsiniz...");
        }
        if(miktar>bakiye){
            System.out.println("Bakiyeniz yetersiz...\n Bakiyeniz:" + bakiye);
        }else{
            bakiye=bakiye-miktar;
            System.out.println("Yeni bakiyeniz:" + bakiye);
        }
    }
    public void paraYatırma(double miktar){
        bakiye = bakiye + miktar;
        System.out.println("Yeni bakiyeniz:" + bakiye);
    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
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
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    
}
