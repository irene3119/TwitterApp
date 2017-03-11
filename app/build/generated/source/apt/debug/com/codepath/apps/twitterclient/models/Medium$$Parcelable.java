
package com.codepath.apps.twitterclient.models;

import java.util.ArrayList;
import java.util.List;
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
public class Medium$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.Medium>
{

    private com.codepath.apps.twitterclient.models.Medium medium$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Medium$$Parcelable>CREATOR = new Creator<Medium$$Parcelable>() {


        @Override
        public Medium$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Medium$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Medium$$Parcelable[] newArray(int size) {
            return new Medium$$Parcelable[size] ;
        }

    }
    ;

    public Medium$$Parcelable(com.codepath.apps.twitterclient.models.Medium medium$$2) {
        medium$$0 = medium$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(medium$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.Medium medium$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(medium$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(medium$$1));
            parcel$$1 .writeString(medium$$1 .idStr);
            parcel$$1 .writeString(medium$$1 .sourceStatusIdStr);
            parcel$$1 .writeString(medium$$1 .mediaUrl);
            parcel$$1 .writeString(medium$$1 .sourceUserIdStr);
            parcel$$1 .writeString(medium$$1 .mediaUrlHttps);
            parcel$$1 .writeString(medium$$1 .expandedUrl);
            parcel$$1 .writeString(medium$$1 .type);
            parcel$$1 .writeString(medium$$1 .url);
            parcel$$1 .writeString(medium$$1 .displayUrl);
            if (medium$$1 .indices == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(medium$$1 .indices.size());
                for (java.lang.Integer integer$$0 : ((List<java.lang.Integer> ) medium$$1 .indices)) {
                    if (integer$$0 == null) {
                        parcel$$1 .writeInt(-1);
                    } else {
                        parcel$$1 .writeInt(1);
                        parcel$$1 .writeInt(integer$$0);
                    }
                }
            }
            if (medium$$1 .id == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeLong(medium$$1 .id);
            }
            if (medium$$1 .sourceUserId == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeLong(medium$$1 .sourceUserId);
            }
            if (medium$$1 .sourceStatusId == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeLong(medium$$1 .sourceStatusId);
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.Medium getParcel() {
        return medium$$0;
    }

    public static com.codepath.apps.twitterclient.models.Medium read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.Medium medium$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            medium$$4 = new com.codepath.apps.twitterclient.models.Medium();
            identityMap$$1 .put(reservation$$0, medium$$4);
            medium$$4 .idStr = parcel$$3 .readString();
            medium$$4 .sourceStatusIdStr = parcel$$3 .readString();
            medium$$4 .mediaUrl = parcel$$3 .readString();
            medium$$4 .sourceUserIdStr = parcel$$3 .readString();
            medium$$4 .mediaUrlHttps = parcel$$3 .readString();
            medium$$4 .expandedUrl = parcel$$3 .readString();
            medium$$4 .type = parcel$$3 .readString();
            medium$$4 .url = parcel$$3 .readString();
            medium$$4 .displayUrl = parcel$$3 .readString();
            int int$$0 = parcel$$3 .readInt();
            ArrayList<java.lang.Integer> list$$0;
            if (int$$0 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new ArrayList<java.lang.Integer>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    int int$$2 = parcel$$3 .readInt();
                    java.lang.Integer integer$$1;
                    if (int$$2 < 0) {
                        integer$$1 = null;
                    } else {
                        integer$$1 = parcel$$3 .readInt();
                    }
                    list$$0 .add(integer$$1);
                }
            }
            medium$$4 .indices = list$$0;
            int int$$3 = parcel$$3 .readInt();
            java.lang.Long long$$0;
            if (int$$3 < 0) {
                long$$0 = null;
            } else {
                long$$0 = parcel$$3 .readLong();
            }
            medium$$4 .id = long$$0;
            int int$$4 = parcel$$3 .readInt();
            java.lang.Long long$$1;
            if (int$$4 < 0) {
                long$$1 = null;
            } else {
                long$$1 = parcel$$3 .readLong();
            }
            medium$$4 .sourceUserId = long$$1;
            int int$$5 = parcel$$3 .readInt();
            java.lang.Long long$$2;
            if (int$$5 < 0) {
                long$$2 = null;
            } else {
                long$$2 = parcel$$3 .readLong();
            }
            medium$$4 .sourceStatusId = long$$2;
            com.codepath.apps.twitterclient.models.Medium medium$$3 = medium$$4;
            identityMap$$1 .put(identity$$1, medium$$3);
            return medium$$3;
        }
    }

}
