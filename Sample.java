import java.util.EnumMap;

class Sample {
    enum GadgetType {
        PC("PC"),
        LAPTOP("Laptop");
    
        private String value;
        private GadgetType(String value) { this.value = value;  }
    }
    
    enum PcType {
        PC_MONITOR("PC Monitor"),
        IMAC("IMac");
    
        private String value;
        private PcType(String value) { this.value = value;  }
    }
    
    enum LaptopType {
        DELL("Dell"),
        LENOVO("Lenovo");
    
        private String value;
        private LaptopType(String value) { this.value = value;  }
    }


public GadgetType gadgetBuilder = GadgetType.PC;
public PcType pcType = PcType.PC_MONITOR;
public LaptopType laptopType = LaptopType.LENOVO;
    
    public static void main(String[] args) {
        EnumMap<GadgetType, String> enumSelector = new EnumMap<GadgetType, String>(GadgetType.class);
        enumSelector.put(GadgetType.LAPTOP, "Lenovo");
        enumSelector.put(GadgetType.PC, "IMac");

        System.out.println(enumSelector.get(GadgetType.LAPTOP));
    }
}