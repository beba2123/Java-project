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
    public List<product> getProducts(){
        return products;
    }
}






public class project{
    public static void main(String[] args) {
        serviceAddingProucts obj2 = new serviceAddingProucts();
        // product obj = 
        obj2.addProduct(new product("laptop" , "Asus-vivo", "Adiss Ababa",  2));
        obj2.addProduct(new product("laptop-1" , "Lenovo", "Adiss Ababa",  2));
        obj2.addProduct(new product("laptop-2" , "Hp-Pavilion", "Adiss Ababa",  2));
        obj2.addProduct(new product("laptop-3" , "Dell", "Adiss Ababa",  2));

        List<product> products = obj2.getProducts(); //give me all  the product inside the list..
        for(product Li : products){
            System.out.println(Li);
        }
       
    }
}