package com.example.homework_1;

public class Immutable {

    public final class ImmutablePerson {

        private final String name;

        public ImmutablePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }
}
