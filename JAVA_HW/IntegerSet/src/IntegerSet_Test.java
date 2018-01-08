//Copyright @ U0324017_rightleft. All rights reserved
public class IntegerSet_Test {

	public static void main(String[] args) {
		IntegerSet Set = new IntegerSet(); // create set object
		
		System.out.print("Set A: ");
		Set.insertElement(Set.a,3); // insert element to setA
		Set.insertElement(Set.a,4); // insert element to setA
		Set.insertElement(Set.a,5); // insert element to setA
		Set.insertElement(Set.a,6); // insert element to setA
		Set.toString(Set.a);System.out.println("");
		System.out.print("Set B: ");
		Set.insertElement(Set.b,7); // insert element to setB
		Set.insertElement(Set.b,8); // insert element to setB

		Set.toString(Set.b);System.out.println("");
		System.out.print("Union: ");
		Set.union(Set.a, Set.b);
		Set.toString(Set.Union); // show the union
		System.out.println("");
		System.out.print("Intersection: ");
		Set.intersection(Set.a, Set.b);
		Set.toString(Set.Inter); // show the intersection
		System.out.println("");System.out.println("Equal: "+ Set.isEqualto());
		System.out.println("");System.out.println("");
		
		System.out.println("Set A-----delete 3 4");
		Set.deleteElement(Set.a,3); // delete element to setA
		Set.deleteElement(Set.a,4); // delete element to setA
		System.out.println("Set B-----insert 5 6");
		Set.insertElement(Set.b,5); // insert element to setB
		Set.insertElement(Set.b,6); // insert element to setB
		System.out.print("Set A: ");Set.toString(Set.a);System.out.println("");
		System.out.print("Set B: ");Set.toString(Set.b);System.out.println("");
		System.out.print("Union: ");
		Set.union(Set.a, Set.b);
		Set.toString(Set.Union); // show the union
		System.out.println("");
		System.out.print("Intersection: ");
		Set.intersection(Set.a, Set.b);
		Set.toString(Set.Inter); // show the intersection
		System.out.println("");System.out.println("Equal: "+ Set.isEqualto());
		System.out.println("");System.out.println("");
		
		System.out.println("Set B-----insert 7 8");
		Set.deleteElement(Set.b,7); // delete element to setB
		Set.deleteElement(Set.b,8); // delete element to setB
		System.out.print("Set A: ");Set.toString(Set.a);System.out.println("");
		System.out.print("Set B: ");Set.toString(Set.b);System.out.println("");
		System.out.print("Union: ");
		Set.union(Set.a, Set.b);
		Set.toString(Set.Union); // show the union
		System.out.println("");
		System.out.print("Intersection: ");
		Set.intersection(Set.a, Set.b);
		Set.toString(Set.Inter); // show the intersection
		System.out.println("");System.out.println("Equal: "+ Set.isEqualto());

	}

}
