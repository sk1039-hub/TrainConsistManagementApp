public class UC15 {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie Class
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                System.out.println("Assigning cargo: " + cargo + " to " + shape + " bogie");

                // Safety rule: Petroleum not allowed in Rectangular bogie
                if (shape.equalsIgnoreCase("Rectangular")
                        && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException(
                            "Unsafe Assignment: Petroleum cannot be loaded into Rectangular bogie"
                    );
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully");

            } catch (CargoSafetyException e) {
                System.out.println("Exception Caught: " + e.getMessage());

            } finally {
                System.out.println("Finalizing cargo assignment for " + shape + " bogie\n");
            }
        }
    }

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum"); // safe

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Coal"); // safe

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Petroleum"); // unsafe

        System.out.println("Program continues safely...");
    }
}