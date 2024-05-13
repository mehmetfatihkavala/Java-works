public class Product {

    public Product(int _id,String _name,String _description,double _price,int _stockAmount ){
        System.out.println("Yapıcı blok çalıştı...");
        this._id = _id;
        this._name = _name;
        this._description = _description;
        this._price= _price;
        this._stockAmount = _stockAmount;
    }

    public Product(){

    }

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _kod;

    public int get_id(){
        return _id;
    }

    public void setId(int ıd){
        _id = ıd;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }

    public  String get_kod(){
        return this._name.substring(0,1) + _id;
    }
}
