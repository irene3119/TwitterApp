
package com.codepath.apps.twitterclient.models;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-03-10T21:51+0800")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class BoundingBox$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.BoundingBox>
{

    private com.codepath.apps.twitterclient.models.BoundingBox boundingBox$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<BoundingBox$$Parcelable>CREATOR = new Creator<BoundingBox$$Parcelable>() {


        @Override
        public BoundingBox$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new BoundingBox$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public BoundingBox$$Parcelable[] newArray(int size) {
            return new BoundingBox$$Parcelable[size] ;
        }

    }
    ;

    public BoundingBox$$Parcelable(com.codepath.apps.twitterclient.models.BoundingBox boundingBox$$2) {
        boundingBox$$0 = boundingBox$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(boundingBox$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.BoundingBox boundingBox$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(boundingBox$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(boundingBox$$1));
            if (boundingBox$$1 .coordinates == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(boundingBox$$1 .coordinates.size());
                for (java.util.List<java.util.List<java.lang.Double>> list$$0 : ((java.util.List<java.util.List<java.util.List<java.lang.Double>>> ) boundingBox$$1 .coordinates)) {
                    if (list$$0 == null) {
                        parcel$$1 .writeInt(-1);
                    } else {
                        parcel$$1 .writeInt(list$$0 .size());
                        for (java.util.List<java.lang.Double> list$$1 : ((java.util.List<java.util.List<java.lang.Double>> ) list$$0)) {
                            if (list$$1 == null) {
                                parcel$$1 .writeInt(-1);
                            } else {
                                parcel$$1 .writeInt(list$$1 .size());
                                for (java.lang.Double double$$0 : ((java.util.List<java.lang.Double> ) list$$1)) {
                                    if (double$$0 == null) {
                                        parcel$$1 .writeInt(-1);
                                    } else {
                                        parcel$$1 .writeInt(1);
                                        parcel$$1 .writeDouble(double$$0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            parcel$$1 .writeString(boundingBox$$1 .type);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.BoundingBox getParcel() {
        return boundingBox$$0;
    }

    public static com.codepath.apps.twitterclient.models.BoundingBox read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.BoundingBox boundingBox$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            boundingBox$$4 = new com.codepath.apps.twitterclient.models.BoundingBox();
            identityMap$$1 .put(reservation$$0, boundingBox$$4);
            int int$$0 = parcel$$3 .readInt();
            java.util.ArrayList<java.util.List<java.util.List<java.lang.Double>>> list$$2;
            if (int$$0 < 0) {
                list$$2 = null;
            } else {
                list$$2 = new java.util.ArrayList<java.util.List<java.util.List<java.lang.Double>>>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    int int$$2 = parcel$$3 .readInt();
                    java.util.ArrayList<java.util.List<java.lang.Double>> list$$3;
                    if (int$$2 < 0) {
                        list$$3 = null;
                    } else {
                        list$$3 = new java.util.ArrayList<java.util.List<java.lang.Double>>(int$$2);
                        for (int int$$3 = 0; (int$$3 <int$$2); int$$3 ++) {
                            int int$$4 = parcel$$3 .readInt();
                            java.util.ArrayList<java.lang.Double> list$$4;
                            if (int$$4 < 0) {
                                list$$4 = null;
                            } else {
                                list$$4 = new java.util.ArrayList<java.lang.Double>(int$$4);
                                for (int int$$5 = 0; (int$$5 <int$$4); int$$5 ++) {
                                    int int$$6 = parcel$$3 .readInt();
                                    java.lang.Double double$$1;
                                    if (int$$6 < 0) {
                                        double$$1 = null;
                                    } else {
                                        double$$1 = parcel$$3 .readDouble();
                                    }
                                    list$$4 .add(double$$1);
                                }
                            }
                            list$$3 .add(list$$4);
                        }
                    }
                    list$$2 .add(list$$3);
                }
            }
            boundingBox$$4 .coordinates = list$$2;
            boundingBox$$4 .type = parcel$$3 .readString();
            com.codepath.apps.twitterclient.models.BoundingBox boundingBox$$3 = boundingBox$$4;
            identityMap$$1 .put(identity$$1, boundingBox$$3);
            return boundingBox$$3;
        }
    }

}
