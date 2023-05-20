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






public class project{
    public static void main(String[] args) {
        product obj = new product();
          System.out.println(obj);
    }
}