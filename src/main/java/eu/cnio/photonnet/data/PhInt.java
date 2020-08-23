package eu.cnio.photonnet.data;

public class PhInt implements PhItem {

    private int value;

    public PhInt(int value) {
        this.value = value;
    }
    
    public int getIntValue() {
        return value;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }
    
    @Override
    public boolean equals(Object o) {
        return (o instanceof PhInt)
            && (value == ((PhInt)o).value);
    }

}
