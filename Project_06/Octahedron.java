import java.text.DecimalFormat;

/**
 * Octahedron class is a model of octahedrons to be initialized later on as 
 * needed.
 * 
 * @author Michael Harden
 * @version September 16, 2020
 */
public class Octahedron {

   // - Instance variables
   private String label = "";
   private String color = "";
   private double edgeLength = 0.0;

   // - Constructors

   /** 
    * Constructs new instance of Octahedron class.
    * 
    * @param labelIn String - what label will be set to
    * @param colorIn String - what color will be se to
    * @param edgeLengthIn double - what edgeLenght will be set to
    */
   public Octahedron(String labelIn, String colorIn, double edgeLengthIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeLengthIn);
   }

   // - Methods

   /**
    * returns content of label.
    *
    * @return String
    */
   public String getLabel() {
      return label;
   }

   /**
    * sets label to labelIn - returns true if label is reset, faults if not.
    *
    * @param labelIn String
    * @return boolean
    */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }

   /**
    * returns content of color.
    *
    * @return String
    */
   public String getColor() {
      return color;
   }

   /**
    * sets color to colorIn - returns true if color is reset, faults if not.
    * @param colorIn String
    * @return boolean
    */
   public boolean setColor(String colorIn) {
      boolean isSet = false;
      if (colorIn != null) {
         color = colorIn.trim();
         isSet = true;
      }
      return isSet;
   }

   /**
    * returns content of edgeLength.
    *
    * @return double
    */
   public double getEdge() {
      return edgeLength;
   }

   /**
    * sets edgeLenght to edgeLenghtIn - returns true if edgeLeght is reset, 
    * faults if not.
    *
    * @param edgeLengthIn doube
    * @return boolean
    */
   public boolean setEdge(double edgeLengthIn) {
      boolean isSet = false;
      if (edgeLengthIn >= 0) {
         edgeLength = edgeLengthIn;
         isSet = true;
      }
      return isSet;
   }

   /**
    * returns surface area of the octahedron.
    *
    * @return double
    */
   public double surfaceArea() {
      double surfaceArea = 2 * Math.sqrt(3) * Math.pow(edgeLength, 2);
      return surfaceArea;
   }

   /**
    * returns volune of the octahedron.
    *
    * @return double
    */
   public double volume() {
      double volume = Math.sqrt(2) / 3 * Math.pow(edgeLength, 3);
      return volume;
   }

   /**
    * returns the ratio of the surface area to the volume of the octahedron.
    * 
    * @return double
    */
   public double surfaceToVolumeRatio() {
      double ratio = surfaceArea() / volume();
      return ratio;
   }

   /**
    * returns formatted string of data about the octohedron.
    *
    * @return String
    */
   public String toString() {
   
      // initializes DecimalFormat
      DecimalFormat pattern = new DecimalFormat("#,##0.0###");
   
      // formats octahedron data
      String outPut = "Octahedron \"" + label + "\" is \"" + color 
         + "\" with 12 edges of length " + edgeLength + " units.";
      outPut += "\n\tsurface area = " + pattern.format(surfaceArea())
         + " square units";
      outPut += "\n\tvolume = " + pattern.format(volume()) 
         + " cubic units";
      outPut += "\n\tsurface/volume ratio = " 
         + pattern.format(surfaceToVolumeRatio());
   
      return outPut;
   }
}