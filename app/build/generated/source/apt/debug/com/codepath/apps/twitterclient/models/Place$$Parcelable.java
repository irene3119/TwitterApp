
package com.codepath.apps.twitterclient.models;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-03-11T22:58+0800")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Place$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.Place>
{

    private com.codepath.apps.twitterclient.models.Place place$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Place$$Parcelable>CREATOR = new Creator<Place$$Parcelable>() {


        @Override
        public Place$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Place$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Place$$Parcelable[] newArray(int size) {
            return new Place$$Parcelable[size] ;
        }

    }
    ;

    public Place$$Parcelable(com.codepath.apps.twitterclient.models.Place place$$2) {
        place$$0 = place$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(place$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.Place place$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(place$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(place$$1));
            parcel$$1 .writeString(place$$1 .country);
            com.codepath.apps.twitterclient.models.BoundingBox$$Parcelable.write(place$$1 .boundingBox, parcel$$1, flags$$0, identityMap$$0);
            parcel$$1 .writeString(place$$1 .placeType);
            parcel$$1 .writeString(place$$1 .countryCode);
            parcel$$1 .writeString(place$$1 .name);
            parcel$$1 .writeString(place$$1 .fullName);
            parcel$$1 .writeString(place$$1 .id);
            parcel$$1 .writeString(place$$1 .url);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.Place getParcel() {
        return place$$0;
    }

    public static com.codepath.apps.twitterclient.models.Place read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.Place place$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            place$$4 = new com.codepath.apps.twitterclient.models.Place();
            identityMap$$1 .put(reservation$$0, place$$4);
            place$$4 .country = parcel$$3 .readString();
            BoundingBox boundingBox$$0 = com.codepath.apps.twitterclient.models.BoundingBox$$Parcelable.read(parcel$$3, identityMap$$1);
            place$$4 .boundingBox = boundingBox$$0;
            place$$4 .placeType = parcel$$3 .readString();
            place$$4 .countryCode = parcel$$3 .readString();
            place$$4 .name = parcel$$3 .readString();
            place$$4 .fullName = parcel$$3 .readString();
            place$$4 .id = parcel$$3 .readString();
            place$$4 .url = parcel$$3 .readString();
            com.codepath.apps.twitterclient.models.Place place$$3 = place$$4;
            identityMap$$1 .put(identity$$1, place$$3);
            return place$$3;
        }
    }

}
