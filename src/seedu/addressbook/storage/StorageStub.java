package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public class StorageStub implements Storage {

    public StorageStub() {
    }
    
    @Override
    public Storage initialise() throws InvalidStorageFilePathException {
        // TODO Auto-generated method stub
        return new StorageStub();
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // TODO Auto-generated method stub
        return new AddressBook();
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // TODO Auto-generated method stub
        return;
    }

    @Override
    public String getPath() {
        // TODO Auto-generated method stub
        return null;
    }

}
