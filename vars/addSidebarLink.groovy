def call(Map config) {
  def action = new AddSidebarLinkAction("testLinkFromDarin","star.gif","http://www.darinpope.com/",null)
  //action = [
  //  displayName: "testdarin",
  //  urlName: "http://www.darinpope.com",
  //  iconFileName: "star.gif"
  //] as hudson.model.PermalinkProjectAction
  currentBuild.rawBuild.addAction(action)
}
