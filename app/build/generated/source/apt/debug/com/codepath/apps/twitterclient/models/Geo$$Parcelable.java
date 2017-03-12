
package com.codepath.apps.twitterclient.models;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-03-12T23:11+0800")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Geo$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.Geo>
{

    private com.codepath.apps.twitterclient.models.Geo geo$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Geo$$Parcelable>CREATOR = new Creator<Geo$$Parcelable>() {


        @Override
        public Geo$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Geo$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Geo$$Parcelable[] newArray(int size) {
            return new Geo$$Parcelable[size] ;
        }

    }
    ;

    public Geo$$Parcelable(com.codepath.apps.twitterclient.models.Geo geo$$2) {
        geo$$0 = geo$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(geo$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.Geo geo$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(geo$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(geo$$1));
            if (geo$$1 .coordinates == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(geo$$1 .coordinates.size());
                for (java.lang.Double double$$0 : ((List<java.lang.Double> ) geo$$1 .coordinates)) {
                    if (double$$0 == null) {
                        parcel$$1 .writeInt(-1);
                    } else {
                        parcel$$1 .writeInt(1);
                        parcel$$1 .writeDouble(double$$0);
                    }
                }
            }
            parcel$$1 .writeString(geo$$1 .type);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.Geo getParcel() {
        return geo$$0;
    }

    public static com.codepath.apps.twitterclient.models.Geo read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.Geo geo$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            geo$$4 = new com.codepath.apps.twitterclient.models.Geo();
            identityMap$$1 .put(reservation$$0, geo$$4);
            int int$$0 = parcel$$3 .readInt();
            ArrayList<java.lang.Double> list$$0;
            if (int$$0 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new ArrayList<java.lang.Double>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    int int$$2 = parcel$$3 .readInt();
                    java.lang.Double double$$1;
                    if (int$$2 < 0) {
                        double$$1 = null;
                    } else {
                        double$$1 = parcel$$3 .readDouble();
                    }
                    list$$0 .add(double$$1);
                }
            }
            geo$$4 .coordinates = list$$0;
            geo$$4 .type = parcel$$3 .readString();
            com.codepath.apps.twitterclient.models.Geo geo$$3 = geo$$4;
            identityMap$$1 .put(identity$$1, geo$$3);
            return geo$$3;
        }
    }

}
