
package com.codepath.apps.twitterclient.models;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-03-10T23:53+0800")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class ExtendedEntities$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.ExtendedEntities>
{

    private com.codepath.apps.twitterclient.models.ExtendedEntities extendedEntities$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<ExtendedEntities$$Parcelable>CREATOR = new Creator<ExtendedEntities$$Parcelable>() {


        @Override
        public ExtendedEntities$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new ExtendedEntities$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public ExtendedEntities$$Parcelable[] newArray(int size) {
            return new ExtendedEntities$$Parcelable[size] ;
        }

    }
    ;

    public ExtendedEntities$$Parcelable(com.codepath.apps.twitterclient.models.ExtendedEntities extendedEntities$$2) {
        extendedEntities$$0 = extendedEntities$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(extendedEntities$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.ExtendedEntities extendedEntities$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(extendedEntities$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(extendedEntities$$1));
            if (extendedEntities$$1 .media == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(extendedEntities$$1 .media.size());
                for (com.codepath.apps.twitterclient.models.Medium medium$$0 : ((List<com.codepath.apps.twitterclient.models.Medium> ) extendedEntities$$1 .media)) {
                    com.codepath.apps.twitterclient.models.Medium$$Parcelable.write(medium$$0, parcel$$1, flags$$0, identityMap$$0);
                }
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.ExtendedEntities getParcel() {
        return extendedEntities$$0;
    }

    public static com.codepath.apps.twitterclient.models.ExtendedEntities read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.ExtendedEntities extendedEntities$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            extendedEntities$$4 = new com.codepath.apps.twitterclient.models.ExtendedEntities();
            identityMap$$1 .put(reservation$$0, extendedEntities$$4);
            int int$$0 = parcel$$3 .readInt();
            ArrayList<com.codepath.apps.twitterclient.models.Medium> list$$0;
            if (int$$0 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new ArrayList<com.codepath.apps.twitterclient.models.Medium>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    com.codepath.apps.twitterclient.models.Medium medium$$1 = com.codepath.apps.twitterclient.models.Medium$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$0 .add(medium$$1);
                }
            }
            extendedEntities$$4 .media = list$$0;
            com.codepath.apps.twitterclient.models.ExtendedEntities extendedEntities$$3 = extendedEntities$$4;
            identityMap$$1 .put(identity$$1, extendedEntities$$3);
            return extendedEntities$$3;
        }
    }

}
