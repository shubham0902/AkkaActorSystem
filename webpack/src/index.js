import HelloWorldButton from "./components/hello-world-button/hello-world-button";
import Heading from "./components/heading/heading";

const b = new HelloWorldButton();
b.render();

const c = new Heading();
c.render();

if (process.env.NODE_ENV === "production") {
  console.log("production");
} else if (process.env.NODE_ENV === "development") {
  console.log("development");
}
