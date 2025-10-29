@SuppressWarnings("module")
module ch12.sec06 {
    requires jakarta.json.bind;
	opens com.horstmann.places to org.eclipse.yasson;
}
