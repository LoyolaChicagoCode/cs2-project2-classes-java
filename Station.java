public class Station {

  public final static String city = "Chicago";
  public static double fare = 2.25;

  public final static double LOOP_LAT = 41.88204;
  public final static double LOOP_LON = -87.62790;

  private double lat;
  private double lon;
  private String name = "Loop";
  private final String line;

  public Station() {
    this.lat = LOOP_LAT;
    this.lon = LOOP_LON;
    this.name = "Wells";
    this.line = "BROWN";
  }

  public Station(final String name, final String line, final double lat, final double lon) {
    this.name = name;
    this.line = line;
    this.lat = lat;
    this.lon = lon;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getLine() {
    return line;
  }

  public double getLatitude() {
    return lat;
  }

  public void setLatitude(final double lat) {
    this.lat = lat;
  }

  public double getLongitude() {
    return lon;
  }

  public void setLongitude(final double lon) {
    this.lon = lon;
  }

  public double distanceFromLoop() {
    final var dLat = lat - LOOP_LAT;
    final var dLon = lon - LOOP_LON;
    return Math.sqrt(Math.pow(dLat, 2) + Math.pow(dLon, 2));
  }

  public void reportStatus(final String statusString) {
    System.out.println(name + " station is " + statusString);
  }

  public void relocate(final double lon) {
    this.lon += lon;
  }

  public void changeName() {
    name = "Berwyn";
  }
}