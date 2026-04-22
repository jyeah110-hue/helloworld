package e260421;

import java.util.ArrayList;
import java.util.List;

import e260421.dll.ChildProduct;
import e260421.dll.Storage;
import e260421.dll.StorageImpl1;
import e260421.dll.StorageImpl2;

public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("SmartTV");
        product.setCompany("Samsung");

        List<Storage<Tv>> storages = new ArrayList<>();
        storages.add(new StorageImpl1<>());
        storages.add(new StorageImpl2<>());

        for (int i = 0; i < args.length; i++) {
            Storage<Tv> storage = storages.get(i);
            storage.add(new Tv(), i);
            Tv tv = storage.get(i);
        }
    }
}

class Tv {
    
}
