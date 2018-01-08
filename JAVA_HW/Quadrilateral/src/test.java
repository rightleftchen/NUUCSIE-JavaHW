//Copyright @ U0324017_rightleft. All rights reserved

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle(6,6);
        Square square = new Square(5);
        Circle circle = new Circle(7);
        Sphere sphere = new Sphere(11);
        Cube cube = new Cube(10);
        Tetrahedron tetra = new Tetrahedron(8);
        Shape[] shapes = new Shape[6];

        shapes[0] = triangle;
        shapes[1] = square;
        shapes[2] = circle;
        shapes[3] = sphere;
        shapes[4] = cube;
        shapes[5] = tetra;

        for(int i=0; i<shapes.length; i++){
            System.out.printf("Shape[%d] is a %s\n",
                i, shapes[i].getClass().getSimpleName());
        }

        System.out.println();

        ThreeDimensionalShape shape3D;

        for(Shape s : shapes){
            System.out.print(s);

            if (s instanceof TwoDimensionalShape){
                System.out.printf("Area: %.2f\n", s.getArea());
                System.out.println();
            }
            else{
            	shape3D = (ThreeDimensionalShape)s;
                System.out.printf("Area: %.2f\n", s.getArea());
                System.out.printf("Volume: %.2f\n", shape3D.getVolume());
                System.out.println();
            }
        }
	}

}
