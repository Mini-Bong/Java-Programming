package JavaProgramming.DesignPattern.CreationalDesignPattern;


class Computer{
    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    protected boolean isBluetoothEnabled;

    public String getHDD(){
        return HDD;
    }
    public String getRAM(){
        return RAM;
    }
    public boolean isGraphicsCardEnabled(){
        return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled(){
        return isBluetoothEnabled;
    }
    

    private Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isBluetoothEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }


    public static class ComputerBuilder{
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
        public ComputerBuilder(String hdd, String ram){
            this.HDD = hdd;
            this.RAM = ram;
        }
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        
        public ComputerBuilder setBluethootEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}


public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "8 GB")
        .setBluethootEnabled(true)
        .setGraphicsCardEnabled(true)
        .build();

        System.out.println("HDD : " + computer.getHDD());
    }
}
