import KiwiImage from "./components/kiwi-image/kiwi-image";
import Heading from "./components/heading/heading";
import _ from "lodash";

const c = new Heading();
c.render(_.upperFirst("kiwi"));

const d = new KiwiImage();
d.render("hello world");
