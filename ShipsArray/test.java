//BS'D
public class test {
    public static void main(String[] args) {

        Ship[] shipsArr = new Ship[3];

        shipsArr[0]  = new Ship("Atlantis"," 1972");
        shipsArr[1]  = new CruiseShip("Blue Bird", 234);
        shipsArr[2] = new CargoShip("Voyager", 3000);

        for(int i = 0; i < shipsArr.length; i++)
            System.out.println(shipsArr[i].toString());
    }
}
