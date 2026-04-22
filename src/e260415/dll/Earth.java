package e260415.dll;

public class Earth {
    public static final double EARTH_RADIUS = 6400;
    public static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = (4 * Math.PI) * Math.pow(EARTH_RADIUS, 2);
    }
}
