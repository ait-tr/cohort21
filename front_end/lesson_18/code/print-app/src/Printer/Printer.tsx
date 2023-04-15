import React from "react";
import './Printer.css';

type Props = { peredaem: string };

const Printer = ({ peredaem }: Props) => {
  return <div id="printer">{peredaem}</div>;
};
export default Printer;
