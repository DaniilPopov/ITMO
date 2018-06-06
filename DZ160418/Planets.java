package DZ160418;

public class Planets {
    public static void main(String[] args) {
        for (ourPlanets op : ourPlanets.values()) {
            System.out.println("Масса планеты " + op + " состовляет " + op.mass + " радиус " + op.radius + " радиус орибты " + op.radius);
        }
    }

    public enum ourPlanets {
        MERCURY(3.303, 2.3297, 341.3),
        VENUS(4.869, 6.0518, 1235.12),
        EARTH(5.976, 6.3781, 634.1),
        MARS(6.421, 3.397, 5474.6),
        JUPITER(1.7, 7.1492, 562.7),
        SATURN(5.673, 2.55569, 8941.4),
        URANUS(8.686, 2.555, 9231.6),
        NEPTUNE(1.024, 2.4447, 2351.7);

        private double mass;
        private double radius;
        private double orbit;

        private ourPlanets(double mass, double radius, double orbit) {
            this.mass = mass;
            this.orbit = orbit;
            this.radius = radius;
        }

        public double getMass() {
            return mass;
        }

        public double getRadius() {
            return radius;
        }

        public double getOrbit() {
            return orbit;
        }
    }
}