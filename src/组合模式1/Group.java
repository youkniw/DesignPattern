package 组合模式1;

import java.util.ArrayList;
import java.util.List;


public class Group extends Component {
    public Group(String name) {
        this.name = name;

    }

    public ArrayList<Component> getComponents() {
        return components;

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;
    public ArrayList<Component> components = new ArrayList<>();

    @Override
    public void add(Component ccomponent) {
        components.add(ccomponent);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);

    }

    @Override
    public void share(Component component) {
        if (component instanceof Group) {
            ArrayList<Component> com = ((Group) component).getComponents();

            for (Component object : components) {
                object.share(object);

            }

        } else if (component instanceof Member) {
            ((Member) component).onMessage();

        }


    }


}
