import React, { useEffect } from "react";
import { useState } from "react";


const navLinks = [
  { href: "#presentations", label: "Presentations" },
  { href: "#jobs", label: "Jobs" },
  { href: "#sponsors", label: "Sponsors" },
  //{ href: "#experience", label: "Experience" },
];

const MenuBar = () => {
    const [isMobileOpen,setIsMobileOpen] = useState(false);
    const [isScrolled,setIsScrolled] = useState(false);
    useEffect(()=>{
      const handleScroll = ()=>{
        setIsScrolled(window.scrollY>50)
        
      }
      window.addEventListener("scroll", handleScroll);
      return () => {
        window.removeEventListener("scroll", handleScroll);
      };
    },[])
  return (
    <header className={`fixed top-0 left-0 w-full z-50 backdrop-blur-md ${isScrolled ? "glass-strong py-3" : "bg-transparent py-3"}`}>
      <nav className="max-w-7xl mx-auto px-6 py-4 flex items-center justify-between">
        
        <a href="#" className="text-xl font-bold tracking-wide text-white">
          logo<span className="text-primary">.</span>
        </a>
        <div className="hidden md:flex items-center gap-6 glass rounded-full px-3 py-2">
          {navLinks.map((link, index) => (
            <a
              key={index}
              href={link.href}
              className="px-4 py-2 text-sm text-muted-foreground hover:text-white rounded-full hover:bg-white/10 transition-all duration-200"
            >
              {link.label}
            </a>
            
          ))}
          <div className=" justify-end gap-2">
          <button className="px-4 py-2 text-sm text-muted-foreground hover:text-white rounded-full hover:bg-white/10 transition-all duration-200">register </button>
        <button className="px-4 py-2 text-sm text-muted-foreground hover:text-white rounded-full hover:bg-white/10 transition-all duration-200">login</button>
        </div>

        </div>
        {/* Button */}
        <div className="hidden md:block">
        </div>
        <div className="md:hidden p-2 text-foreground cursor-pointer">
          <button onClick={()=>setIsMobileOpen((prev)=>!prev)}>
            {isMobileOpen?<p>X</p>:<p>menu</p>}
          
            </button>
        </div>
      </nav>
      {/* Mobile Menu (hidden by default) */}
      {isMobileOpen&&(
        <div className="md:hidden glass-strong animate-fade-in">
        <div className="container mx-auto px-6 py-6 flex flex-col gap-4">
             {navLinks.map((link, index) => (
            <a
              key={index}
              href={link.href}
              onClick={()=>setIsMobileOpen(false)}
              className="text-lg text-muted-foreground hover:text-foreground py-2"
            >
              {link.label}
            </a>
          ))}
           <button className="text-lg text-muted-foreground hover:text-foreground py-2 bg-primary rounded-full">register </button>
        <button className="text-lg text-muted-foreground hover:text-foreground py-2 bg-primary rounded-full">login</button>
        </div>
        
      </div>
        )}
    </header>
  );
};

export default MenuBar;
