public class Odev1Ogrenci {
     public void guneGoreSiraliEkle(Ilan ilan) {
        Node<Ilan> node =new Node<>(ilan,null,null);
        addFirst(ilan);
        
        int a = node.value.getGun();
        if(node.next.value.getGun())
        int b = node.next.value.getGun();
            
        while(a>b){
                node.previous.next = node;
                node.previous = node;
        }
        setSize(size()+1);
    }

    /**
     * Bu metot bağlı listeye ekleme yaparken ilanların fiyatlarının küçükten büyüğe doğru sıralı olmasını sağlar
     * @param ilan Eklenecek ilan
     */
    public void fiyataGoreSiraliEkle(Ilan ilan){

    }

    /**
     * Bu metot bağlı listeye ekleme yaparken ilanların günlerine göre sıralama yapar, eğer günleri aynı ise fiyatlarına göre kendi aralarında küçükten büyüğe sıralama yapar
     * @param ilan
     */
    public void guneVeFiyataGoreSiraliEkle(Ilan ilan) {

    }
}
