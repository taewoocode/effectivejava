package chap2;

import java.util.Objects;

public class MyPizza extends Pizza {

    MyPizza(Pizza.Builder<?> builder) {
        super( builder );
    }

    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull( size );
        }

        @Override
        public MyPizza build() {
            return new MyPizza( this );
        }

        @Override
        protected Builder self() {
            return this;
        }

        private MyPizza(Builder builder) {
            super( builder );
            size = builder.size;
        }
    }

}
