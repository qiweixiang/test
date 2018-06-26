package nima;
import java.util.List;

import com.jd.jshop.kepler.inter.client.domain.node.dataBinding.BaseDataBindingElement;
import com.jd.jshop.kepler.inter.client.domain.node.dataDefine.EditPropertyElement;
import com.jd.jshop.kepler.inter.client.domain.node.layout.LayoutElement;
import com.jd.jshop.kepler.inter.client.domain.node.style.BaseStyleElement;


public class BaseContaine {

	
	   private String containerType;
	    private List descriptions;
	    private LayoutElement layout;
	    private BaseStyleElement style;
	    private BaseDataBindingElement dataBinding;
	    private EditPropertyElement editProperty;
	    private List events;
	    private List conditions;
	    protected List children;
		public String getContainerType() {
			return containerType;
		}
		public void setContainerType(String containerType) {
			this.containerType = containerType;
		}
		public List getDescriptions() {
			return descriptions;
		}
		public void setDescriptions(List descriptions) {
			this.descriptions = descriptions;
		}
		public LayoutElement getLayout() {
			return layout;
		}
		public void setLayout(LayoutElement layout) {
			this.layout = layout;
		}
		public BaseStyleElement getStyle() {
			return style;
		}
		public void setStyle(BaseStyleElement style) {
			this.style = style;
		}
		public BaseDataBindingElement getDataBinding() {
			return dataBinding;
		}
		public void setDataBinding(BaseDataBindingElement dataBinding) {
			this.dataBinding = dataBinding;
		}
		public EditPropertyElement getEditProperty() {
			return editProperty;
		}
		public void setEditProperty(EditPropertyElement editProperty) {
			this.editProperty = editProperty;
		}
		public List getEvents() {
			return events;
		}
		public void setEvents(List events) {
			this.events = events;
		}
		public List getConditions() {
			return conditions;
		}
		public void setConditions(List conditions) {
			this.conditions = conditions;
		}
		public List getChildren() {
			return children;
		}
		public void setChildren(List children) {
			this.children = children;
		}
	    
	    
}
