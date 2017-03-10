
package com.codepath.apps.twitterclient.models;

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
public class HashTag$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.HashTag>
{

    private com.codepath.apps.twitterclient.models.HashTag hashTag$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<HashTag$$Parcelable>CREATOR = new Creator<HashTag$$Parcelable>() {


        @Override
        public HashTag$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new HashTag$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public HashTag$$Parcelable[] newArray(int size) {
            return new HashTag$$Parcelable[size] ;
        }

    }
    ;

    public HashTag$$Parcelable(com.codepath.apps.twitterclient.models.HashTag hashTag$$2) {
        hashTag$$0 = hashTag$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(hashTag$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.HashTag hashTag$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(hashTag$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(hashTag$$1));
            parcel$$1 .writeString(hashTag$$1 .text);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.HashTag getParcel() {
        return hashTag$$0;
    }

    public static com.codepath.apps.twitterclient.models.HashTag read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.HashTag hashTag$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            hashTag$$4 = new com.codepath.apps.twitterclient.models.HashTag();
            identityMap$$1 .put(reservation$$0, hashTag$$4);
            hashTag$$4 .text = parcel$$3 .readString();
            com.codepath.apps.twitterclient.models.HashTag hashTag$$3 = hashTag$$4;
            identityMap$$1 .put(identity$$1, hashTag$$3);
            return hashTag$$3;
        }
    }

}
