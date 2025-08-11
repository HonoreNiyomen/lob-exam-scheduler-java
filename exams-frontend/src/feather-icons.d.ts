declare module 'feather-icons' {
  export interface FeatherIcon {
    name: string;
    contents: string;
    tags: string[];
    attrs: {
      [key: string]: string;
    };
    toSvg: (attrs?: { [key: string]: string }) => string;
  }

  export function replace(options?: { [key: string]: string }): void;
  export function toSvg(name: string, options?: { [key: string]: string }): string;
  export const icons: { [key: string]: FeatherIcon };
}