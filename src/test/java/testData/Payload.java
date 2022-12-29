package testData;

import java.util.ArrayList;
import java.util.List;
import pojo.AddPlace;
import pojo.AddLocation;
public class Payload
{
    public AddPlace addPlacePayLoad(String name, String language, String address)
    {
        AddPlace place =new AddPlace();
        place.setAccuracy(50);
        place.setAddress(address);
        place.setLanguage(language);
        place.setPhone_number("(+965) 994 847 89");
        place.setWebsite("https://rahulshettyacademy.com");
        place.setName(name);
        List<String> myList =new ArrayList<String>();
        myList.add("Farwaniya park");
        myList.add("Cafe");

        place.setTypes(myList);
        AddLocation location =new AddLocation();
        location.setLat(-38.383494);
        location.setLng(33.427362);
        place.setLocation(location);
        return place;
    }

}
