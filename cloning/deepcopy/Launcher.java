package deepcopy;

class DepthReading implements Cloneable {

    private double depth;
    
    public DepthReading(double depth) {
    
        this.depth = depth;
    }
    
    public Object clone() {
    
        Object o = null;
        
        try {
        
            o = super.clone();
            
        } catch(CloneNotSupportedException e) {
        
            e.printStackTrace();
        }
        
        return o;
    }
    
    public double getDepth() {
    
        return depth;
    }
    
    public void setDepth(double depth) {
    
        this.depth = depth;
    }
    
    public String toString() {
    
        return String.valueOf(depth);
    }
}

class TemperatureReading implements Cloneable {

    private long time;
    private double temperature;
    
    public TemperatureReading(double temperature) {
    
        this.time = System.currentTimeMillis();
        this.temperature = temperature;
    }
    
    public Object clone() {
    
        Object o = null;
        
        try {
        
            o = super.clone();
            
        } catch (CloneNotSupportedException e) {
        
            e.printStackTrace();
        }
        
        return o;
    }
    
    public double getTemperature() {
    
        return temperature;
    }
    
    public void setTemperature(double temperature) {
    
        this.temperature = temperature;
    }
    
    public String toString() {
    
        return String.valueOf(temperature);
    }
}

class OceanReading implements Cloneable {

    private DepthReading depth;
    private TemperatureReading temperature;
    
    public OceanReading(double tdata, double ddata) {
    
        temperature = new TemperatureReading(tdata);
        depth = new DepthReading(ddata);
    }
    
    public Object clone() {
    
        OceanReading o = null;
      
        try {
        
            o = (OceanReading) super.clone();
            
        } catch (CloneNotSupportedException e) {
        
            e.printStackTrace();
        }
        
        // Must clone references.
        o.depth = (DepthReading) o.depth.clone();
        o.temperature = (TemperatureReading) o.temperature.clone();
        
        // Upcasts back to Object.
        return o;
    }
    
    public TemperatureReading getTemperatureReading() {
    
        return temperature;
    }
    
    public void setTemperatureReading(TemperatureReading tr){
    
        temperature = tr;
    }
    
    public DepthReading getDepthReading() {
    
        return depth;
    }
    
    public void setDepthReading(DepthReading dr) {
    
        this.depth = dr;
    }
    
    public String toString() {
    
        return "temperature: " + temperature + ", depth: " + depth;
    }
}

public class Launcher {

    public static void main(String[] args) {
    
        OceanReading reading = new OceanReading(33.9, 100.5);
        
        // Now clone it.
        OceanReading clone = (OceanReading) reading.clone();
        TemperatureReading tr = clone.getTemperatureReading();
        
        tr.setTemperature(tr.getTemperature() + 1);
        clone.setTemperatureReading(tr);
        
        DepthReading dr = clone.getDepthReading();
        
        dr.setDepth(dr.getDepth() + 1);
        clone.setDepthReading(dr);
        
        System.out.println("Ocean reading: " + reading);
        System.out.println("Temperature reading: " + tr);
        System.out.println("Depth reading: " + dr);
        
        // Expected original values:
        // temperature: 33.9, depth: 100.5
        // Expected clone values:
        // temperature: 34.9, depth: 101.5
    }
}
