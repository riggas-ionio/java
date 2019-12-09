

public class Stock implements java.io.Serializable{
    
    private String symbol;
    private String name;
    private float currentValue; 
    private float openningValue;
    
    public Stock(String symbol , String name){
        this.symbol = symbol;
        this.name = name;
    }
    
    public void setCurrentValue(float currentValue){
        this.currentValue = currentValue;
    }
    
    public void setOpenningValue(float openningValue){
        this.openningValue = openningValue;
    }
    
    public String getSymbol(){
        return this.symbol;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        float def = currentValue - openningValue;
        return this.symbol + "(" + this.name + "):$" + this.currentValue + "($" + def + ")";
        
    }
    
    public	int	compareTo(Stock other){
        
        if(other.currentValue < this.currentValue){
            return -1;
        }else if (other.currentValue > this.currentValue){
            return 1;
        }else{
            return 0;
        }
        
    }
    
}