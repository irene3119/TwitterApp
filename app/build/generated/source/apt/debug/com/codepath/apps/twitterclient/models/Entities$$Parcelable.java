
package com.codepath.apps.twitterclient.models;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-03-10T01:16+0800")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Entities$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.Entities>
{

    private com.codepath.apps.twitterclient.models.Entities entities$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Entities$$Parcelable>CREATOR = new Creator<Entities$$Parcelable>() {


        @Override
        public Entities$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Entities$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Entities$$Parcelable[] newArray(int size) {
            return new Entities$$Parcelable[size] ;
        }

    }
    ;

    public Entities$$Parcelable(com.codepath.apps.twitterclient.models.Entities entities$$2) {
        entities$$0 = entities$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(entities$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.Entities entities$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(entities$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(entities$$1));
            if (entities$$1 .urls == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(entities$$1 .urls.size());
                for (com.codepath.apps.twitterclient.models.Url url$$0 : ((java.util.List<com.codepath.apps.twitterclient.models.Url> ) entities$$1 .urls)) {
                    com.codepath.apps.twitterclient.models.Url$$Parcelable.write(url$$0, parcel$$1, flags$$0, identityMap$$0);
                }
            }
            if (entities$$1 .hashtags == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(entities$$1 .hashtags.size());
                for (com.codepath.apps.twitterclient.models.HashTag hashTag$$0 : ((java.util.List<com.codepath.apps.twitterclient.models.HashTag> ) entities$$1 .hashtags)) {
                    com.codepath.apps.twitterclient.models.HashTag$$Parcelable.write(hashTag$$0, parcel$$1, flags$$0, identityMap$$0);
                }
            }
            if (entities$$1 .userMentions == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(entities$$1 .userMentions.size());
                for (com.codepath.apps.twitterclient.models.UserMention userMention$$0 : ((java.util.List<com.codepath.apps.twitterclient.models.UserMention> ) entities$$1 .userMentions)) {
                    com.codepath.apps.twitterclient.models.UserMention$$Parcelable.write(userMention$$0, parcel$$1, flags$$0, identityMap$$0);
                }
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.Entities getParcel() {
        return entities$$0;
    }

    public static com.codepath.apps.twitterclient.models.Entities read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.Entities entities$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            entities$$4 = new com.codepath.apps.twitterclient.models.Entities();
            identityMap$$1 .put(reservation$$0, entities$$4);
            int int$$0 = parcel$$3 .readInt();
            java.util.ArrayList<com.codepath.apps.twitterclient.models.Url> list$$0;
            if (int$$0 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new java.util.ArrayList<com.codepath.apps.twitterclient.models.Url>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    com.codepath.apps.twitterclient.models.Url url$$1 = com.codepath.apps.twitterclient.models.Url$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$0 .add(url$$1);
                }
            }
            entities$$4 .urls = list$$0;
            int int$$2 = parcel$$3 .readInt();
            java.util.ArrayList<com.codepath.apps.twitterclient.models.HashTag> list$$1;
            if (int$$2 < 0) {
                list$$1 = null;
            } else {
                list$$1 = new java.util.ArrayList<com.codepath.apps.twitterclient.models.HashTag>(int$$2);
                for (int int$$3 = 0; (int$$3 <int$$2); int$$3 ++) {
                    com.codepath.apps.twitterclient.models.HashTag hashTag$$1 = com.codepath.apps.twitterclient.models.HashTag$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$1 .add(hashTag$$1);
                }
            }
            entities$$4 .hashtags = list$$1;
            int int$$4 = parcel$$3 .readInt();
            java.util.ArrayList<com.codepath.apps.twitterclient.models.UserMention> list$$2;
            if (int$$4 < 0) {
                list$$2 = null;
            } else {
                list$$2 = new java.util.ArrayList<com.codepath.apps.twitterclient.models.UserMention>(int$$4);
                for (int int$$5 = 0; (int$$5 <int$$4); int$$5 ++) {
                    com.codepath.apps.twitterclient.models.UserMention userMention$$1 = com.codepath.apps.twitterclient.models.UserMention$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$2 .add(userMention$$1);
                }
            }
            entities$$4 .userMentions = list$$2;
            com.codepath.apps.twitterclient.models.Entities entities$$3 = entities$$4;
            identityMap$$1 .put(identity$$1, entities$$3);
            return entities$$3;
        }
    }

}
