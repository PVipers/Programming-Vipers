package datamanagement;
public class ListUnitsCTL {
    private UnitManager um;
public ListUnitsCTL() {
        um = UnitManager.UM(); //gets the data
}
            public void listUnits( IUnitLister lister ) {
lister.clearUnits(); //clear the lister units
UnitMap units = um.getUnits(); //get the data from map
        for (String s : units.keySet() )
            lister.addUnit(units.get(s));//gets the data from string s
            }}
