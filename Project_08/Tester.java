public class Tester {
   public static void main(String[] args) {

      Spherocylinder ex1 = new Spherocylinder("Small Example ", 1, 1);
      Spherocylinder ex2 = new Spherocylinder("Medium Example ", 2, 2);
      Spherocylinder ex3 = new Spherocylinder("Large Example ", 3, 3);
      Spherocylinder[] list1 = { ex1, ex2, ex3 };
      Spherocylinder[] list2 = { null, ex1, null, ex2 };
      SpherocylinderList sphList = new SpherocylinderList("Lister", list2, 1);

      // -- TO STRING --
      // System.out.print(sphList);

      // -- FIND SPHEROCYLINDER --
      // System.out.println(sphList.findSpherocylinder(" small example "));

      // -- DELETE SPHEROCYLINDER --
      // System.out.println(sphList + "\n\n\n");
      // System.out.println(sphList.deleteSpherocylinder(" small example ") +
      // "\n\n\n");
      // System.out.println(sphList);

      // -- EDIT SPHEROCYLINDER --
      System.out.println(sphList + "\n\n\n");
      System.out.println(sphList.editSpherocylinder(" medium example ", 500, 700) + "\n\n\n");
      System.out.println(sphList);

      // -- FIND LARGEST --//
      // System.out.println(sphList.findSpherocylinderWithLargestVolume());
   }
}
