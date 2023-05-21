import java.util.ArrayList;
import java.util.List;


class product{ 
    private int warranty;
    private String name;
    private String place;
    private String type;

    //set constructor for our project..
    public product(){  //==> this one is fot the default one.    
    }
    public product(String name, String place, String type, int warranty){  //this one is for the default parameter
        this.name = name;
        this.place = place;
        this.type = type;
        this.warranty = warranty;
    }
    //then we create a setter  and getter for our private instance variable..
    public int getwarranty(){
        return warranty;
    }
    public void setwarranty(int warranty){
        this.warranty = warranty;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getPlace(){
        return place;
    }
    public void setPlace(String place){
        this.place =place;
    }
    public String gettype(){
        return type;
    }
    public void  settype(String type){
        this.type = type;
    } 

    @Override
    public String toString() { //to print out my objects..
        return "{" +
            " warranty='" + warranty + "'" +
            ", name='" + name + "'" +
            ", place='" + place + "'" +
            ", type='" +type + "'" +
            "}";
    }

}
class serviceAddingProucts{
    List<product> products = new ArrayList<>();

    public void addProduct(product obj){
        products.add(obj); 
    }
    public List<product> getAllProducts(){
        return products;
    }
    public product getSingleProduct(String name){  
          for(product p : products){
            if(p.getname().equals(name)){
                return p;
            // }else if(p.gettype().equals(type)){
            //     return p;
            // }
          }
        }
        return null;
    }
    public product getplace(String place){
        for(product p : products){
            if(p.getPlace().equals(place)){
                return p;
            }
        }
        return null;
    }
    public List<product> getProductsWithTxt(String text){
        String str = text.toLowerCase();
        List<product> prods = new ArrayList<>();
            for(product p : products){
                String name = p.getPlace().toLowerCase();
                String type = p.getname().toLowerCase();
                String place = p.getPlace().toLowerCase();
                if(name.contains(str) || type.contains(str) || place.contains(str)){
                    prods.add(p);
                }
            }
        return prods;
    }
}

public class project{
    public static void main(String[] args) {
        serviceAddingProucts obj2 = new serviceAddingProucts();
        // product obj = 
        obj2.addProduct(new product("laptop" , "Adiss Abeba", "Asus-Nitro",  2));
        obj2.addProduct(new product("laptop-1" , "bishoftu", "Lenovo-yoga",  2));
        obj2.addProduct(new product("laptop-2" , "Adama", "Hp-Pavillion",  2));
        obj2.addProduct(new product("laptop-3" , "Dukem", "Dell-optima",  2));

        // List<product> products = obj2.getAllProducts(); //give me all  the product inside the list..
        // for(product Li : products){
        //     System.out.println(Li);
        // }
    //     product p = obj2.getSingleProduct("laptop");
    //     System.out.println(p);
    //    System.out.println(obj2.getplace("bishoftu"));
        List<product> prods = obj2.getProductsWithTxt("ad");
        for(product p1 : prods){
        System.out.println(p1);
        }
    }
}
