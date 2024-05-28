package elementoquimico;

public class ElementoQuimico {

    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    public ElementoQuimico(String name, String symbol, int atomicNumber, double atomicWeight) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(double atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    @Override
    public String toString() {
        return "ElementoQuimico{"
                + "name='" + name + '\''
                + ", symbol='" + symbol + '\''
                + ", atomicWeight=" + atomicWeight
                + '}';
    }

    String getAtomicMass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
