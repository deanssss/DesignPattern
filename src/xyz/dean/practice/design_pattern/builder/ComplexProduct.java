package xyz.dean.practice.design_pattern.builder;

public class ComplexProduct {
    private final String name;
    private final int maxTotal;
    private final int maxIdle;
    private final int minIdle;

    private ComplexProduct(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    @Override
    public String toString() {
        return "ComplexProduct{" +
                "name='" + name + '\'' +
                ", maxTotal=" + maxTotal +
                ", maxIdle=" + maxIdle +
                ", minIdle=" + minIdle +
                '}';
    }

    static class Builder {
        private final String name; // 必须
        private int maxTotal = 8;  // 可选
        private int maxIdle = 8;   // 可选
        private int minIdle = 0;   // 可选

        public Builder(String name) {
            this.name = name;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal <= 0) throw new IllegalArgumentException("maxTotal <= 0");
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle > maxTotal) throw new IllegalArgumentException("maxIdle > maxTotal");
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle > maxIdle) throw new IllegalArgumentException("minIdle > maxIdle");
            this.minIdle = minIdle;
            return this;
        }

        public ComplexProduct build() {
            return new ComplexProduct(this);
        }
    }

    public static void main(String[] args) {
        ComplexProduct product = new Builder("pool")
                .setMaxTotal(3)
                .setMaxIdle(2)
                .setMinIdle(1)
                .build();
        System.out.println(product.toString());
    }
}