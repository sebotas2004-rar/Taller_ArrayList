package co.edu.uptc.logic;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;
	import co.edu.uptc.logic.BaseClass;

	public class Management <T extends BaseClass> {
	    private List<T> listObject;

	    public Management() {
	        this.listObject = new ArrayList<>();
	    }

	    public boolean insertObject(T object) {
	        if (findObjectById(object.getId()) == null) {
	            this.listObject.add(object);
	            return true;
	        }
	        return false;
	    }

	    public T findObjectById(String id) {
	        return this.listObject.stream()
	                .filter(t -> t.getId().equals(id))
	                .findAny()
	                .orElse(null);
	    }

	    public int findIndexById(String id) {
	        for (int i = 0; i < listObject.size(); i++) {
	            if (listObject.get(i).getId().equals(id)) return i;
	        }
	        return -1;
	    }

	    public boolean deleteObject(String id) {
	        int index = findIndexById(id);
	        if (index != -1) {
	            listObject.remove(index);
	            return true;
	        }
	        return false;
	    }

	    public List<T> getList() { return listObject; }
	}
